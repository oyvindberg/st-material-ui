package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputAdornmentTypeM
import com.olvind.mui.muiMaterial.inputAdornmentClassesMod.InputAdornmentClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentMod {
  
  @JSImport("@mui/material/InputAdornment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/api/input-adornment/)
    */
  @JSImport("@mui/material/InputAdornment", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = js.native
  
  @scala.inline
  def getInputAdornmentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputAdornmentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/InputAdornment", "inputAdornmentClasses")
  @js.native
  val inputAdornmentClasses: InputAdornmentClasses = js.native
}
