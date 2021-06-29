# 程式設計(二) 期末專題
## 黃絹 407570323

## 專題用途
1.此專題是關於咖啡廳的菜單應用。

2.模式有文字模式及GUI模式。

3.功能都是分為顯示菜單列表及新增菜單餐點兩種。

## 使用方式
執行程式為 com.fju.Tester，一開始會在Run的區域看到文字，輸入"1"會進到文字模式，並且都是以使用者輸入數字或文字做功能的使用。

輸入"2"後會自動開啟GUI視窗即進到GUI模式，視窗可以直接看到目前的菜單餐點有哪些。增加餐點的部分，可以直接輸入名字、類型和價格，點擊Add按鈕即動態增加到視窗上了，使用者若有一欄位以上給空值，按下按鈕會跳出警訊對話框。

## 未完成
1.不過因為沒有用到資料庫或是資料儲存傳遞部分，在新增完餐點後，使用者選擇離開，菜單是不會做變動的，會重置初始的狀態......。

2.文字模式跟GUI模式的菜單不是共用的......，因為在做GUI的時候碰到了動態增加的困難，就使用了網路上的建GUI List方式做，並且菜單的新增顯示也是寫在GUI.java。