package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBreadcrumbsTypeMapn
import com.olvind.mui.muiMaterial.breadcrumbsClassesMod.BreadcrumbsClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@mui/material/Breadcrumbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/api/breadcrumbs/)
    */
  @JSImport("@mui/material/Breadcrumbs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element] = js.native
  
  @JSImport("@mui/material/Breadcrumbs", "breadcrumbsClasses")
  @js.native
  val breadcrumbsClasses: BreadcrumbsClasses = js.native
  
  @scala.inline
  def getBreadcrumbsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
