package com.olvind.mui.muiJoy.components

import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant
import com.olvind.mui.muiJoy.inputInputPropsMod.InputOwnerState
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledInputEndDecorator {
  
  inline def apply(ownerState: InputOwnerState): SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement] = {
    val __props = js.Dynamic.literal(ownerState = ownerState.asInstanceOf[js.Any])
    new SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement](js.Array(this.component, __props.asInstanceOf[/* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant]))
  }
  
  @JSImport("@mui/joy/Input/Input", "StyledInputEndDecorator")
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant
  
  def styled: Builder[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant, 
    SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement]
  ] = new Builder[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant, 
    SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant): SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement] = new SharedBuilder_MUIStyledCommonPropsThemeDetailedHTMLProAriaactivedescendant_889857473[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
