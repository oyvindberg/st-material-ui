package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.large
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullWidth extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialToggleButtonClasses] = js.native
  
  /**
    * The color of the button when it is in an active state.
    * @default 'standard'
    */
  var color: js.UndefOr[standard | primary | secondary | error | info | success | warning] = js.native
  
  /**
    * If `true`, the  keyboard focus ripple is disabled.
    * @default false
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the button will take up the full width of its container.
    * @default false
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the button is rendered in an active state.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the component.
    * The prop defaults to the value inherited from the parent ToggleButtonGroup component.
    * @default 'medium'
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The value to associate with the button when selected in a
    * ToggleButtonGroup.
    */
  var value: NonNullable[Any] = js.native
}
object FullWidth {
  
  @scala.inline
  def apply(value: NonNullable[Any]): FullWidth = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullWidth]
  }
  
  @scala.inline
  implicit class FullWidthMutableBuilder[Self <: FullWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialToggleButtonClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: standard | primary | secondary | error | info | success | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: NonNullable[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
