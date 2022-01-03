package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tooltipTooltipMod.TooltipComponentsPropsOverrides
import com.olvind.mui.muiSystem.createStyledMod.MUIStyledCommonProps
import com.olvind.mui.react.mod.HTMLProps
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arrow extends StObject {
  
  var arrow: js.UndefOr[
    HTMLProps[HTMLSpanElement] with MUIStyledCommonProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] with TooltipComponentsPropsOverrides
  ] = js.native
  
  var popper: js.UndefOr[PartialPopperPropsTooltipComponentsProps] = js.native
  
  var tooltip: js.UndefOr[
    HTMLProps[HTMLDivElement] with MUIStyledCommonProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] with TooltipComponentsPropsOverrides
  ] = js.native
  
  var transition: js.UndefOr[
    com.olvind.mui.muiMaterial.transitionMod.TransitionProps with TooltipComponentsPropsOverrides
  ] = js.native
}
object Arrow {
  
  @scala.inline
  def apply(): Arrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit class ArrowMutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(
      value: HTMLProps[HTMLSpanElement] with MUIStyledCommonProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] with TooltipComponentsPropsOverrides
    ): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setPopper(value: PartialPopperPropsTooltipComponentsProps): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    @scala.inline
    def setTooltip(
      value: HTMLProps[HTMLDivElement] with MUIStyledCommonProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] with TooltipComponentsPropsOverrides
    ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransition(
      value: com.olvind.mui.muiMaterial.transitionMod.TransitionProps with TooltipComponentsPropsOverrides
    ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
