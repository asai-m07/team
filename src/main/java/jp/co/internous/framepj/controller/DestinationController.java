package jp.co.internous.framepj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import jp.co.internous.framepj.model.form.DestinationForm;

/**
 * 宛先情報に関する処理のコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/frameweb/destination")
public class DestinationController {
	
	/*
	 * フィールド定義
	 */
	
	
	private Gson gson = new Gson();
	
	/**
	 * 宛先画面を初期表示する
	 * @param m 画面表示用オブジェクト
	 * @return 宛先画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		/*
		   「12_画面設計書_宛先登録.pdf」を表示する。
		 	※DBから取得する内容は以下の【出力内容】を参照。
			※ログインしているユーザーのユーザー情報のみ取得する。
		 */
		//return "destination";
	}
	
	/**
	 * 宛先情報を削除する
	 * @param destinationId 宛先情報ID
	 * @return true:削除成功、false:削除失敗
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/delete")
	@ResponseBody
	public boolean delete(@RequestBody String destinationId) {
		/*
		 * クリアボタンを押下されると、宛先登録画面の入力内容をクリアする。
		 */
	}
	
	/**
	 * 宛先情報を登録する
	 * @param f 宛先情報のフォーム
	 * @return 宛先情報id
	 */
	@PostMapping("/register")
	@ResponseBody
	public String register(@RequestBody DestinationForm f) {
		
		/*
		確認ボタンを押下された場合は、入力チェック(【入力チェック】参照)をおこなう。
		　・エラーがない場合は、DBの宛先情報マスタテーブルに入力値を登録する。
		※DBに登録する内容は以下の【入力内容】を参照。
		　・登録成功した場合は、以下の処理をおこなう。
		　　1)登録した宛先情報のIDを取得する。
		 */
		
		
		
	}
}
