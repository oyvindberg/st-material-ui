package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormControlTypeMapd
import com.olvind.mui.muiMaterial.anon.Error
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlMod extends Shortcut {
  
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
  @JSImport("@mui/material/FormControl/FormControl", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element] = js.native
  
  type FormControlProps[D /* <: ReactElement */, P] = OverrideProps[FormControlTypeMap[P, D], D]
  
  trait FormControlPropsColorOverrides extends StObject
  
  trait FormControlPropsSizeOverrides extends StObject
  
  trait FormControlTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Error
  }
  object FormControlTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Error): FormControlTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlTypeMap[P, D]]
    }
    
    extension [Self <: FormControlTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (FormControlTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Error): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formControlFormControlMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element] = default
}
