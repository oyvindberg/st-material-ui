package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsBreadcrumbsTypeMapn
import com.olvind.mui.muiJoy.breadcrumbsBreadcrumbsClassesMod.BreadcrumbsClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@mui/joy/Breadcrumbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/joy-ui/react-breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/joy-ui/api/breadcrumbs/)
    */
  @JSImport("@mui/joy/Breadcrumbs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element | Null] = js.native
  
  @JSImport("@mui/joy/Breadcrumbs", "breadcrumbsClasses")
  @js.native
  val breadcrumbsClasses: BreadcrumbsClasses = js.native
  
  inline def getBreadcrumbsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
