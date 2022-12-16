package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Active
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepTypeMapdiv
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepStepMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stepper](https://mui.com/material-ui/react-stepper/)
    *
    * API:
    *
    * - [Step API](https://mui.com/material-ui/api/step/)
    */
  @JSImport("@mui/material/Step/Step", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element] = js.native
  
  type StepClasskey = /* keyof std.NonNullable<@mui/material.anon.PartialStepClasses | undefined & std.Partial<@mui/material.@mui/material/styles.ClassNameMap<never>> | undefined> */ String
  
  type StepProps[D /* <: ReactElement */, P] = OverrideProps[StepTypeMap[P, D], D]
  
  trait StepTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Active
  }
  object StepTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Active): StepTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (StepTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Active): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `stepStepMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element] = default
}
