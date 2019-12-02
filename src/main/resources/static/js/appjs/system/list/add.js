$().ready(function() {
	validateRule();
});
$().ready(function() {
	html1=''
	html2=''
	$.ajax({
		cache : true,
		type : "GET",
		url : "/system/list/orcale",
		async : false,
		success : function(data) {
			var environment = data.environment;
			var component = data.component;
			for (i=0;i<environment.length;i++){
				html1+='<option>'+environment[i]+'</option>'
			}
			for (i=0;i<component.length;i++){
				html2+='<option>'+component[i]+'</option>'
			}
			$('#en').append(html1)
			$('#co').append(html2)
		}})
});
$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/system/list/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}