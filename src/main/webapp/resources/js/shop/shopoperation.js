/**
 * 商铺注册
 */

$(function(){
	var initUrl ='/o2o/shopadmin/getshopinitinfo';
	var registerShopUrl = '/o2o/shopadmin/registershop';
	get
	function getShopInitInfo() {
		$.getJSON(initUrl, function(data) {
			if(data.success){
				var tempHtml = '';
				var tempAreaHtml ='';
				data.shopCategoryList.map(function(item,index){
					tempHtml +='<operation data-id="' +item.shopCategoryId +'">'
					+ item.shopCategoryName + '</option>';
				});
				data.areaList.map(function(item,index){
					tempAreaHtml +='<operation data-id="' +item.areaId +'">'
					+ item.areaName + '</option>';
				});
				$('#shop-category').html(tempHtml);
				$('#area').html(tempAreaHtml);
			}
		});
		$('#submit').click(function(){
			var shop = {};
			shop.shopName = ('#shop-name').val();
			shop.shopArr =  ('#shop-addr').val();
			shop.phone =  ('#phone').val();
			shop.shopDesc = $("#shop-desc").val();
			// 选择id,双重否定=肯定
			shop.shopCategory = {
				// 这里定义的变量要和ShopCategory.shopCategoryId保持一致，否则使用databind转换会抛出异常
				shopCategoryId : $('#shop-category').find('option').not(function() {
					return !this.selected;
				}).data('id')
			};
			shop.area = {
				// 这里定义的变量要和Area.areaId属性名称保持一致，否则使用databind转换会抛出异常
				areaId : $('#area').find('option').not(function() {
					return !this.selected;
				}).data('id')
			};
			// 获取图片文件流
			var shopImg = $('#shop-img')[0].files[0];
			var formData = new FormData();
			formData.append('shopImg', shopImg);
			formData.append('shopStr', JSON.stringify(shop));
			$.ajax({
				url:isEdit ? modifyShopUrl:registerShopUrl,
				type : 'POST',
				data : formData,
				contentType : false,
				processData : false,
				cache : false,
				success : function(data) {
					if (data.success) {
						$.toast("提交成功！");
					} else {
						$.toast("提交失败！" + data.errMsg);
					}
					// 更换验证码
					//$('#kaptcha_img').click();
				}
			});	
		});
	}
})



