package jp.co.internous.framepj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.framepj.model.form.SearchForm;

/**
 * 商品検索に関する処理を行うコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/frameweb")
public class IndexController {
	
	/*
	 * フィールド定義
	 */
	a
	
	
	/**
	 * トップページを初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/")
	public String index(Model m) {
		/*画面設計書02 トップページ画面を表示する。
		 * 
		 * DBから取得する内容
		 * ①カテゴリ　ドロップダウン
		 * カラム：mst_category.category_name
		 * ・プルダウンの選択肢を取得した内容を設定
		 * ・初期表示時は未選択、検索時は指定したカテゴリー名を選択
		 * 
		 * ②商品名 入力ボックス（検索キーワード）
		 * カラムなし
		 * 初期表示時は未入力、検索時は入力された検索キーワードを表示
		 * 
		 * ③商品画像
		 * カラム：mst_product.image_full_path
		 * 取得した内容をimgタグのsrc属性に設定
		 * 
		 * ④商品名
		 * カラム：mst_product.product_name
		 * 
		 * ⑤価格
		 * カラム：mst_product.price
		 * 
		 * ⑥商品ID
		 * カラム：mst_product.id
		 * カートに追加する際に使用するためhiddenで表示
		 * 
		 * 未ログイン状態、かつ仮ユーザーIDを保持していない場合は、
		 * 仮ユーザーID(負の9桁のランダムな数字)を作成し、
		 * セッションに保持する。
		 * 
		 */
	}
	
	/**
	 * 検索処理を行う
	 * @param f 検索用フォーム
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm f, Model m) {
		/*
		 * 【検索ボタン押下】
		 * 
		 * ①下記内容で検索ワードを編集。
		 * ・全角スペースを半角スペースに変換
		 * ・2個以上の半角スペースを1個の半角スペースに変換
		 * ・先頭と末尾のスペースを削除
		 * 
		 * ② ①で編集したキーワードをスペース区切りで分割し、
		 * 下記条件で商品情報の検索処理をおこない、商品情報を取得する。
		 * ＜条件＞
		 * (1)
		 * 入力値：検索ワード
		 * DBテーブル：mst_product
		 * カラム：product_name
		 * 検索条件：部分一致
		 * 評価条件：OR
		 * 備考：入力されていない場合は空欄とする。
		 * 
		 * (2)
		 * 入力値：カテゴリ
		 * DBテーブル：mst_product
		 * カラム：category_id
		 * 検索条件：完全一致
		 * 評価条件：AND
		 * 
		 * ※ 検索ワードが未入力で且つ、カテゴリ未選択の場合
		 *    全商品を一覧表示する。
		 * 
		 * ③トップ画面に遷移する。
		 * 
		 * 【商品名がクリックされた場合】
		 * 商品IDに紐づくその商品の商品詳細画面に遷移する。
		 * 
		 * 【商品画像がクリックされた場合】
		 * 商品IDに紐づくその商品の商品詳細画面に遷移する。
		 */
	}
}
