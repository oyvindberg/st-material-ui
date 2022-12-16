package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ActiveStep
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepperTypeMapdiv
import com.olvind.mui.muiMaterial.anon.PickPaperPropsPaperTypeMapdivdefaultComp
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperStepperMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stepper](https://mui.com/material-ui/react-stepper/)
    *
    * API:
    *
    * - [Stepper API](https://mui.com/material-ui/api/stepper/)
    */
  @JSImport("@mui/material/Stepper/Stepper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element] = js.native
  
  object Orientation {
    
    inline def horizontal: "horizontal" = "horizontal".asInstanceOf["horizontal"]
    
    inline def vertical: "vertical" = "vertical".asInstanceOf["vertical"]
  }
  type Orientation = "horizontal" | "vertical"
  
  type StepperClasskey = /* keyof std.NonNullable<@mui/material.anon.PartialStepperClasses | undefined & std.Partial<@mui/material.@mui/material/styles.ClassNameMap<never>> | undefined> */ String
  
  type StepperProps[D /* <: ReactElement */, P] = OverrideProps[StepperTypeMap[P, D], D]
  
  trait StepperTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & PickPaperPropsPaperTypeMapdivdefaultComp & ActiveStep
  }
  object StepperTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & PickPaperPropsPaperTypeMapdivdefaultComp & ActiveStep): StepperTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepperTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (StepperTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & PickPaperPropsPaperTypeMapdivdefaultComp & ActiveStep): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `stepperStepperMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element] = default
}
