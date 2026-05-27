package jp.co.internous.framepj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.framepj.model.form.UserForm;

/**
 * ユーザー登録に関する処理を行うコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/frameweb/user")
public class UserController {
		
	/*
	 * フィールド定義
	 */
	
	
	/**
	 * 新規ユーザー登録画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return 新規ユーザー登録画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		/**
		 * 「画面設計書＿新規ユーザー登録.pdf」で提示されているものを表示する
		 */
	}
	
	/**
	 * ユーザー名重複チェックを行う
	 * @param f ユーザーフォーム
	 * @return true:重複あり、false:重複なし
	 */
	@PostMapping("/duplicatedUserName")
	@ResponseBody
	public boolean duplicatedUserName(@RequestBody UserForm f) {
		/**
		 * 重複確認ボタンを押下された場合は、以下の処理をおこなう。

		3ユーザーの存在チェック(DBの会員情報マスタテーブルにユーザー名が一致するユーザーが存在しているかを確認)をおこなう。
		・ユーザー名がDBテーブルに存在する場合は、アラートで以下のメッセージを表示する。
		「入力されたユーザー名は既に存在しています。¥n別のユーザー名をお試しください。」
		・ユーザー名が存在しない場合は、OKを表示し、以下の活性/非活性状態を変更する。

		ユーザー名 入力ボックス：非活性状態
		
		確認ボタン：活性状態
		 */
	}
	
	/**
	 * ユーザー情報登録を行う
	 * @param UserForm ユーザーフォーム
	 * @return true:登録成功、false:登録失敗
	 */
	@PostMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		/**
		 * 登録ボタンを押下された場合は、入力チェック(【入力チェック】参照)をおこなう。
		・エラーが発生した場合は、対象のエラーメッセージJavascriptで動的に作成して表示する。
		・エラーがない場合は、DBの会員情報マスタテーブルに入力値を登録する。
　		※DBに登録する内容は以下の【入力内容】を参照。
		・登録成功した場合は、アラートで「ユーザー情報を登録しました。」を表示する。
		・アラートのOKボタンが押下された際に、トップ画面に遷移する。
		 */
	}
}
