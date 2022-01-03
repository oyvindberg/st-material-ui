package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.DefaultComponentPropsFormControlUnstyled
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlUnstyledFormControlUnstyledMod extends Shortcut {
  
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
    * ⚠️ Only one `Input` can be used within a FormControl because it create visual inconsistencies.
    * For instance, only one input can be focused at the same time, the state shouldn't be shared.
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormControlUnstyled API](https://mui.com/api/form-control-unstyled/)
    */
  @JSImport("@mui/base/FormControlUnstyled/FormControlUnstyled", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormControlUnstyled, Element] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.error
    - `com.olvind.mui`.muiBase.muiBaseStrings.focused
    - `com.olvind.mui`.muiBase.muiBaseStrings.required
  */
  trait NonOptionalOwnerState extends StObject
  object NonOptionalOwnerState {
    
    inline def disabled: com.olvind.mui.muiBase.muiBaseStrings.disabled = "disabled".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.disabled]
    
    inline def error: com.olvind.mui.muiBase.muiBaseStrings.error = "error".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.error]
    
    inline def focused: com.olvind.mui.muiBase.muiBaseStrings.focused = "focused".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.focused]
    
    inline def required: com.olvind.mui.muiBase.muiBaseStrings.required = "required".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.required]
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormControlUnstyled, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formControlUnstyledFormControlUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormControlUnstyled, Element] = default
}
