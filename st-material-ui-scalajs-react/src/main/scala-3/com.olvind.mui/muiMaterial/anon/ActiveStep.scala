package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stepperStepperMod.Orientation
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveStep extends StObject {
  
  /**
    * Set the active step (zero based index).
    * Set to -1 to disable all the steps.
    * @default 0
    */
  var activeStep: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to 'true' and orientation is horizontal,
    * then the step label will be positioned under the icon.
    * @default false
    */
  var alternativeLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Two or more `<Step />` components.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialStepperClasses] = js.undefined
  
  /**
    * An element to be placed between each step.
    * @default <StepConnector />
    */
  var connector: js.UndefOr[Element | Null] = js.undefined
  
  /**
    * If set the `Stepper` will not assist in controlling steps for linear flow.
    * @default false
    */
  var nonLinear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The component orientation (layout flow direction).
    * @default 'horizontal'
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
}
object ActiveStep {
  
  inline def apply(): ActiveStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveStep] (val x: Self) extends AnyVal {
    
    inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
    
    inline def setActiveStepUndefined: Self = StObject.set(x, "activeStep", js.undefined)
    
    inline def setAlternativeLabel(value: Boolean): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
    
    inline def setAlternativeLabelUndefined: Self = StObject.set(x, "alternativeLabel", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialStepperClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setConnector(value: VdomElement): Self = StObject.set(x, "connector", value.rawElement.asInstanceOf[js.Any])
    
    inline def setConnectorNull: Self = StObject.set(x, "connector", null)
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setNonLinear(value: Boolean): Self = StObject.set(x, "nonLinear", value.asInstanceOf[js.Any])
    
    inline def setNonLinearUndefined: Self = StObject.set(x, "nonLinear", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
