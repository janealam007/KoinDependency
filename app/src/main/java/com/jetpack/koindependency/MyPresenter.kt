package com.jetpack.koindependency

/**
 * Simple presenter - use the HelloRepository to "say" hello
 */
class MyPresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from MySimplePresenter"
}