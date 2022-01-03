package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.muiMaterial.typographyClassesMod.TypographyClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod {
  
  @JSImport("@mui/material/Typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Typography](https://mui.com/components/typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@mui/material/Typography", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = js.native
  
  @scala.inline
  def getTypographyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Typography", "typographyClasses")
  @js.native
  val typographyClasses: TypographyClasses = js.native
}
