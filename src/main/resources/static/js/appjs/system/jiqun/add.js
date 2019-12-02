$().ready(function() {
	validateRule();
});
$().ready(function() {
	html1=''
	$.ajax({
		cache : true,
		type : "GET",
		url : "/system/jiqun/pingtai",
		async : false,
		success : function(data) {
			for (i=0;i<data.length;i++){
				html1+='<option>'+data[i]+'</option>'
			}
			$('#c').html(html1)

		}})
});
$().ready(function() {
	d=''
	e=''
	$.ajax({
		cache : true,
		type : "GET",
		url : "/system/jiqun/version",
		async : false,
		success : function(data) {
			var version =data.version
			var cmversion=data.cmversion
			for (i=0;i<version.length;i++){
				d+='<option>'+version[i]+'</option>'
			}
			for (i=0;i<cmversion.length;i++){
				e+='<option>'+cmversion[i]+'</option>'
			}
			$('#d').html(d)
			$('#e').html(e)
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
		url : "/system/jiqun/save",
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