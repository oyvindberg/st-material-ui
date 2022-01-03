package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormControlTypeMapd
import com.olvind.mui.muiMaterial.formControlClassesMod.FormControlClasses
import com.olvind.mui.muiMaterial.useFormControlMod.FormControlState
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("@mui/material/FormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides context such as filled/focused/error/required for form inputs.
    * Relying on the context provides high flexibility and ensures that the state always stays
    * consistent across the children of the `FormControl`.
    * This context is used by the following components:
    *
    * *   FormLabel
    * *   FormHelperText
    * *   Input
    * *   InputLabel
    *
    * You can find one composition example below and more going to [the demos](https://mui.com/components/text-fields/#components).
    *
    * ```jsx
    * <FormControl>
    *   <InputLabel htmlFor="my-input">Email address</InputLabel>
    *   <Input id="my-input" aria-describedby="my-helper-text" />
    *   <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
    * </FormControl>
    * ```
    *
    * ⚠️ Only one `InputBase` can be used within a FormControl because it create visual inconsistencies.
    * For instance, only one input can be focused at the same time, the state shouldn't be shared.
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormControl API](https://mui.com/api/form-control/)
    */
  @JSImport("@mui/material/FormControl", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element] = js.native
  
  @JSImport("@mui/material/FormControl", "formControlClasses")
  @js.native
  val formControlClasses: FormControlClasses = js.native
  
  @scala.inline
  def getFormControlUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def useFormControl(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormControl")().asInstanceOf[js.UndefOr[FormControlState]]
}
