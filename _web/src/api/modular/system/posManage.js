import { axios } from '@/utils/request'

/**
 * 查询系统职位
 *
 * @author yubaoshan
 * @date 2020/5/25 01:31
 */
export function sysPosPage (parameter) {
  return axios({
    url: '/main/sysPos/page',
    method: 'get',
    params: parameter
  })
}

/**
 * 系统职位列表
 *
 * @author yubaoshan
 * @date 2020/6/21 23:50
 */
export function sysPosList (parameter) {
  return axios({
    url: '/main/sysPos/list',
    method: 'get',
    params: parameter
  })
}

/**
 * 添加系统职位
 *
 * @author yubaoshan
 * @date 2020/5/25 01:31
 */
export function sysPosAdd (parameter) {
  return axios({
    url: '/main/sysPos/add',
    method: 'post',
    data: parameter
  })
}

/**
 * 编辑系统职位
 *
 * @author yubaoshan
 * @date 2020/5/25 01:31
 */
export function sysPosEdit (parameter) {
  return axios({
    url: '/main/sysPos/edit',
    method: 'post',
    data: parameter
  })
}

/**
 * 删除系统职位
 *
 * @author yubaoshan
 * @date 2020/5/25 01:31
 */
export function sysPosDelete (parameter) {
  return axios({
    url: '/main/sysPos/delete',
    method: 'post',
    data: parameter
  })
}

/**
 * 导出系统职位
 *
 * @author yubaoshan
 * @date 2021/5/29 16:19
 */
export function sysPosExport (parameter) {
  return axios({
    url: '/main/sysPos/export',
    method: 'get',
    params: parameter,
    responseType: 'blob'
  })
}
