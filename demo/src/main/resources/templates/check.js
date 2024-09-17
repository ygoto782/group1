/**
 * 
 */

function check(){
	if(document.form.syain.value==""){
		alert("社員名を入力してください");
		return false;
	}
	
	if(document.form.age.value==""){
		alert("年齢を入力してください");
		}
		
	if(document.form.pass.value!=pass.matches("[0-9a-zA-Z]{8,}")){
		alert("大小半角英数を含む8文字以上で入力してください");
		}
		
	if(document.form.pass2.value==!pass2.matches(pass)){
		alert("パスワードと同じものを入力してください");
		}
}

