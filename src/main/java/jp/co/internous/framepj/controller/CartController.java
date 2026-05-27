package jp.co.internous.framepj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import jp.co.internous.framepj.model.form.CartForm;


/**
 * カート情報に関する処理のコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/frameweb/cart")
public class CartController {
	
	/*
	 * フィールド定義
	 */
	

	private Gson gson = new Gson();
	

	/**
	 * カート画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return カート画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		/*
		 * 「画面設計書_カート.pdf」の画面を表示する。
			※DBから取得する内容は以下の【出力内容】を参照。
			※ユーザー(ログイン時：ユーザーID,未ログイン時：仮ユーザーID)に紐づくカート情報のみ取得する。
			※カート テーブルは更新日時の降順、登録日時の降順で表示する。
		 */
		/*
		 * 何を受け取るか？
		 * →LoginSessionのuserId,tmpUserId,loggedIn
		 * 
		 * どこに何を渡すか
		 * →cart.htmlにcartsを渡す
		 * 
		 * 必要なDB操作
		 * →findByUserIdでtbl_cartを検索、order by updated_at降順,created_at降順をしておく
		 */
		
		return "cart";
	}

	/**
	 * カートに追加処理を行う
	 * @param f カート情報のForm
	 * @param m 画面表示用オブジェクト
	 * @return カート画面
	 */
	@RequestMapping("/add")
	public String addCart(CartForm f, Model m) {
		/*
		 * 1)DBのカート情報テーブル内でユーザー(ログイン時：ユーザーID、未ログイン時：仮ユーザーID)に紐づく
			カート情報に、追加する商品IDと一致するデータが存在するかチェックし、以下の処理をおこなう。
			・ユーザーに紐づくカート情報に、追加する商品IDと一致するデータが存在する場合は、
			tbl_cart.product_countを『tbl_cart.product_countに購入個数を足した値』で更新する。
			・ユーザーに紐づくカート情報に、追加する商品IDと一致するデータが存在しない場合は、カート情報を登録する。
			※DBに登録する内容は以下の【入力内容】を参照。
			2)カート画面に遷移する。
		 */

	}

	/**
	 * カート情報を削除する
	 * @param checkedIdList 選択したカート情報のIDリスト
	 * @return true:削除成功、false:削除失敗
	 */
	@PostMapping("/delete")
	@ResponseBody
	public boolean deleteCart(@RequestBody String checkedIdList) {
		/*
		 *削除ボタンが押下された場合は、チェックされたカート情報をDBのカート情報テーブルから削除する。
			・削除成功した場合は、カート画面からチェックされたカート情報を削除する。
		 */
		
	}
}
