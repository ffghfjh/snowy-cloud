import 'core-js/stable'
import 'regenerator-runtime/runtime'
import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store/'
import { VueAxios } from './utils/request'
import bootstrap from './core/bootstrap'
import './core/lazy_use'
import './permission'
import './utils/filter'
import './components/global.less'
import { Dialog } from '@/components'
import { hasBtnPermission } from './utils/permissions'
import { sysApplication } from './utils/applocation'
// 表单设计器 str
import KFormDesign from './components/k-form-design/packages'
import './components/k-form-design/static/styles/form-design.less'
Vue.use(KFormDesign)
// 表单设计器 end

Vue.use(VueAxios)
Vue.use(Dialog)
Vue.prototype.hasPerm = hasBtnPermission
Vue.prototype.applocation = sysApplication
Vue.config.productionTip = false

new Vue({
  router,
  store,
  created: bootstrap,
  render: h => h(App)
}).$mount('#app')
