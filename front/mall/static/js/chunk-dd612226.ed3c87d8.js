(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-dd612226"],{"5c9d":function(e,t,n){e.exports=n.p+"static/img/logo4.ec2a7c60.png"},ae38:function(e,t,n){},bd01:function(e,t,n){"use strict";n.r(t);var o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"login-container"},[e._m(0),n("van-form",{staticClass:"form",on:{submit:e.onSubmit}},[n("van-field",{attrs:{type:"number",required:"",clearable:"",name:"手机号",label:"手机号",placeholder:"请输入手机号",rules:[{validator:e.checkPhone,required:!0,message:"请填写正确的手机号！"}]},model:{value:e.form.mobile,callback:function(t){e.$set(e.form,"mobile",t)},expression:"form.mobile"}}),n("van-field",{attrs:{type:"password",required:"",center:"",clearable:"",name:"密码",label:"密码",placeholder:"请输入密码",rules:[{required:!0,message:"请填写密码！"}]},model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}}),n("div",{staticStyle:{margin:"36px"}},[n("van-button",{attrs:{round:"",block:"",loading:e.loading,type:"info","loading-text":"登录中...","native-type":"submit"}},[e._v("提交")]),n("van-button",{staticStyle:{"margin-top":"10px"},attrs:{plain:"",round:"",block:"",type:"info","native-type":"button",to:"/registry"}},[e._v("注册")])],1)],1)],1)},a=[function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"header"},[o("img",{staticClass:"header__logo",attrs:{src:n("5c9d"),alt:"logo"}})])}],i=(n("ac1f"),n("00b4"),n("d3b7"),{name:"Login",data:function(){return{form:{mobile:void 0,password:void 0},loading:!1}},watch:{$route:{handler:function(e){this.redirect=e.query&&e.query.redirect||"/mall"},immediate:!0}},methods:{checkPhone:function(e){if(123456789===e)return!0;var t=/^[1][3,4,5,7,8][0-9]{9}$/;return!!t.test(e)},onSubmit:function(){var e=this;this.loading=!0,console.log("/mall"),this.$store.dispatch("user/login",this.form).then((function(){e.$store.dispatch("address/getList"),e.$notify({type:"success",message:"登录成功",duration:1e3,onOpened:function(){location.href=e.redirect},onClose:function(){location.href=e.redirect}})})).catch((function(t){e.$toast.fail(t.message)})).finally((function(){e.loading=!1}))}}}),r=i,s=(n("c69b"),n("2877")),c=Object(s["a"])(r,o,a,!1,null,"7a41c634",null);t["default"]=c.exports},c69b:function(e,t,n){"use strict";n("ae38")}}]);
//# sourceMappingURL=chunk-dd612226.ed3c87d8.js.map