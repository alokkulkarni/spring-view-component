package com.example.thymeleafcomponentdemo.web.table

import de.tschuehly.spring.viewcomponent.core.ViewComponent
import de.tschuehly.spring.viewcomponent.thymeleaf.ViewContext


@ViewComponent
class TableViewComponent {
    fun render() = ViewContext()
}