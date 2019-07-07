# Java_2
今までに作成したJavaのプログラムを公開しています。
## DrawGridRev.java
キャンバスの右下から左上にかけて格子状に直線が表示されるプログラムです。マウスをクリックするたびに線が一本ずつ増えていきます。
![何回かクリックした後の状態](image2/DrawGrid.JPG "何回かクリックした後の状態")

## ConnectPoints.java
マウスをクリックした位置を線分でつなぐプログラムです。一番最初のクリックでは、ウィンドウ左上からの線分が描かれるようになっています。
![何回かクリックした後の状態](image2/ConnectPoints.JPG "何回かクリックした後の状態")

## InvisivleCircle.java / InvisibleColor.java
以下のようなゲームのプログラムです。InvisibleCircle.javaがゲームのプログラムで、InvisibleCircle.javaは色を変えるためのクラスです。

* ゲーム開始時に，3つの見えない円を生成し，画面上のランダムな位置にそれぞれ配置します。
  * 円の直径はそれぞれ30,45,80ピクセルです。
  * 配置される円は重なっている場合もあります。
* ユーザはマウスを何回かクリックし，カーソル位置が円の内部にヒットするのを狙います。
* マウスがウィンドウを離れたらゲームオーバーとなり，[結果表示画面](#結果表示画面)を表示します。
  * 得点の数え方は[得点表](#得点表)に依拠します。
* マウスをウィンドウ上に戻すとすべての状態はリセットされ，3つの円は(また見えなくなって)別のランダムな位置へ移動します。

### 得点表
ゲームの得点は下記の得点表に従って計算されます。

| 条件 | 点数 |
|----|----:| 
| 3つ全部の円にヒット | 300 |
| 小さい円と中くらいの円にヒット | 200 |
| 小さい円と大きい円にヒット | 150 |
| 中くらいの円と大きい円にヒット | 120 |
| 小さい円にヒット | 100 |
| 中くらいの円にヒット |  50 |
| 大きい円にヒット |  30 |
| 1回のマウスクリック |  -5 |

### 結果表示画面
結果表示画面には以下の情報が表示されます。

* ヒットした円の文章による描写
  * 例「You hit both the middle and the large circle」
* 得点とマウスをクリックした回数
 * 例「Your score is: 10 with 22 clicks」
* 3つの円がどこに配置されていたか
![結果画面の例](image2/InvisibleCircle.JPG "結果画面の例")

## ScrollWords.java / GreetGenerator.java
ScrollWords.javaは、GreetGenerator.javaに登録された様々な言語での「こんにちは」を示す単語をクリックするたびに表示していくプログラムです。一行の文字が40字を超えると、一文字ずつ左にずれていきます。
![何回かクリックした後の状態](image2/Greeting.JPG "何回かクリックした後の状態")
