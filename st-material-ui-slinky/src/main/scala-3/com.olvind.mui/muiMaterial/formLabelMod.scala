package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiMaterial.formLabelClassesMod.FormLabelClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelMod {
  
  @JSImport("@mui/material/FormLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/api/form-label/)
    */
  @JSImport("@mui/material/FormLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = js.native
  
  @JSImport("@mui/material/FormLabel", "formLabelClasses")
  @js.native
  val formLabelClasses: FormLabelClasses = js.native
  
  inline def getFormLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
