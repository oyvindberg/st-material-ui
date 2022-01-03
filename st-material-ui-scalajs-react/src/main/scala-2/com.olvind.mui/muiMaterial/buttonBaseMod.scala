package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.buttonBaseClassesMod.ButtonBaseClasses
import com.olvind.mui.muiMaterial.touchRippleClassesMod.TouchRippleClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseMod {
  
  @JSImport("@mui/material/ButtonBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `ButtonBase` contains as few styles as possible.
    * It aims to be a simple building block for creating a button.
    * It contains a load of style reset and some focus/ripple logic.
    *
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/ButtonBase", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    Element | Null
  ] = js.native
  
  @JSImport("@mui/material/ButtonBase", "buttonBaseClasses")
  @js.native
  val buttonBaseClasses: ButtonBaseClasses = js.native
  
  @scala.inline
  def getButtonBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getTouchRippleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchRippleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ButtonBase", "touchRippleClasses")
  @js.native
  val touchRippleClasses: TouchRippleClasses = js.native
}
