package com.demo

class DemoController {

    def basicCachingService
    def grailsCacheAdminService

    def clearBlocksCache() {
        grailsCacheAdminService.clearBlocksCache()
        render "cleared blocks cache"
    }
    
    def clearTemplatesCache() {
        grailsCacheAdminService.clearTemplatesCache()
        render "cleared templates cache"
    }
    
    def basicCachingServiceInvocationCount() {
        render "Basic Caching Service Invocation Count Is ${basicCachingService.invocationCounter}."
    }

    def basicCachingService() {
        render "Value From Service Is \"${basicCachingService.data}\""
    }

    def blockCache(int counter) {
        [counter: counter]
    }
    
    def renderTag(int counter) {
        [counter: counter]
    }
}
