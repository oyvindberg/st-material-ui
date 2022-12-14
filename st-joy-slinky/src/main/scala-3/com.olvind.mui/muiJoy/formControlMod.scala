package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsFormControlTypeMapd
import com.olvind.mui.muiJoy.formControlFormControlClassesMod.FormControlClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("@mui/joy/FormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Input](https://mui.com/joy-ui/react-input/)
    *
    * API:
    *
    * - [FormControl API](https://mui.com/joy-ui/api/form-control/)
    */
  @JSImport("@mui/joy/FormControl", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/FormControl", "formControlClasses")
  @js.native
  val formControlClasses: FormControlClasses = js.native
  
  inline def getFormControlUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
