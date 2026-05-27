package jp.co.internous.framepj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品情報の詳細に関する処理を行うコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/frameweb/product")
public class ProductController {
	
	/*
	 * フィールド定義
	 */
	

	/**
	 * 商品詳細画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return 商品詳細画面
	 */
	@RequestMapping("/{id}")
	public String index(@PathVariable("id") int id, Model m) {
		
		/*
		 * 「画面設計書_商品詳細.pdf」で指定されている画面を表示する。
				トップページでユーザーが選択した商品の情報を商品idを基にしてデータベースから取得し、表示する。
		 */
		
	}
}
