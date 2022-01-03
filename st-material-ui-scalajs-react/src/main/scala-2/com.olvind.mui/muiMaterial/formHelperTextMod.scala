package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormHelperTextTypeM
import com.olvind.mui.muiMaterial.formHelperTextClassesMod.FormHelperTextClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextMod {
  
  @JSImport("@mui/material/FormHelperText", JSImport.Namespace)
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
    * - [FormHelperText API](https://mui.com/api/form-helper-text/)
    */
  @JSImport("@mui/material/FormHelperText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = js.native
  
  @JSImport("@mui/material/FormHelperText", "formHelperTextClasses")
  @js.native
  val formHelperTextClasses: FormHelperTextClasses = js.native
  
  @scala.inline
  def getFormHelperTextUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHelperTextUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
