package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesStyledMod {
  
  @JSImport("@mui/material/styles/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Custom styled utility that has a default MUI theme.
    * @param tag HTML tag or component that should serve as base.
    * @param options Styled options for the created component.
    * @returns React component that has styles attached to it.
    */
  @JSImport("@mui/material/styles/styled", JSImport.Default)
  @js.native
  val default: CreateMUIStyled[Theme] = js.native
  
  inline def rootShouldForwardProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("rootShouldForwardProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def slotShouldForwardProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("slotShouldForwardProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
