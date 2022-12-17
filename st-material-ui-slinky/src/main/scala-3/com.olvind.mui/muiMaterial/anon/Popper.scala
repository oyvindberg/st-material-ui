package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tooltipTooltipMod.TooltipComponentsPropsOverrides
import com.olvind.mui.muiSystem.createStyledMod.MUIStyledCommonProps
import com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme
import com.olvind.mui.react.mod.HTMLProps
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var arrow: js.UndefOr[
    HTMLProps[HTMLSpanElement] & MUIStyledCommonProps[Theme] & TooltipComponentsPropsOverrides
  ] = js.undefined
  
  var popper: js.UndefOr[PartialPopperPropsTooltipComponentsProps] = js.undefined
  
  var tooltip: js.UndefOr[
    HTMLProps[HTMLDivElement] & MUIStyledCommonProps[Theme] & TooltipComponentsPropsOverrides
  ] = js.undefined
  
  var transition: js.UndefOr[
    com.olvind.mui.muiMaterial.transitionsTransitionMod.TransitionProps & TooltipComponentsPropsOverrides
  ] = js.undefined
}
object Popper {
  
  inline def apply(): Popper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: HTMLProps[HTMLSpanElement] & MUIStyledCommonProps[Theme] & TooltipComponentsPropsOverrides): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setPopper(value: PartialPopperPropsTooltipComponentsProps): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setTooltip(value: HTMLProps[HTMLDivElement] & MUIStyledCommonProps[Theme] & TooltipComponentsPropsOverrides): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransition(
      value: com.olvind.mui.muiMaterial.transitionsTransitionMod.TransitionProps & TooltipComponentsPropsOverrides
    ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
