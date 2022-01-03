package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsLinkTypeMapa
import com.olvind.mui.muiMaterial.linkClassesMod.LinkClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@mui/material/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Links](https://mui.com/components/links/)
    *
    * API:
    *
    * - [Link API](https://mui.com/api/link/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@mui/material/Link", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element] = js.native
  
  @scala.inline
  def getLinkUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Link", "linkClasses")
  @js.native
  val linkClasses: LinkClasses = js.native
}
