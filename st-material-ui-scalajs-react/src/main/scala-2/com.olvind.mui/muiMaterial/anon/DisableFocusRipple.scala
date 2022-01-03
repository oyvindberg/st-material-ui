package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.contained
import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.large
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
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
trait DisableFocusRipple extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialButtonGroupClasses] = js.native
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[inherit | primary | secondary | error | info | success | warning] = js.native
  
  /**
    * If `true`, no elevation is used.
    * @default false
    */
  var disableElevation: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the button keyboard focus ripple is disabled.
    * @default false
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the button ripple effect is disabled.
    * @default false
    */
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the buttons will take up the full width of its container.
    * @default false
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * The component orientation (layout flow direction).
    * @default 'horizontal'
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  /**
    * The size of the component.
    * `small` is equivalent to the dense button styling.
    * @default 'medium'
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The variant to use.
    * @default 'outlined'
    */
  var variant: js.UndefOr[text | outlined | contained] = js.native
}
object DisableFocusRipple {
  
  @scala.inline
  def apply(): DisableFocusRipple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFocusRipple]
  }
  
  @scala.inline
  implicit class DisableFocusRippleMutableBuilder[Self <: DisableFocusRipple] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: PartialButtonGroupClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: inherit | primary | secondary | error | info | success | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
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
    def setVariant(value: text | outlined | contained): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
