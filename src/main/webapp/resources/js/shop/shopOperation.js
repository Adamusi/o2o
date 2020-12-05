/**
 * 商铺注册
 */

$(function(){
	var initUrl ='/o2o/shopadmin/getshopinitinfo';
	var registerShopUrl = '/o2o/shopadmin/registershop';
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
			
		})
		
	}
})



