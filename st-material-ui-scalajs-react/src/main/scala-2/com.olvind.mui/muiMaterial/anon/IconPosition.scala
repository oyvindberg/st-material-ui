package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.bottom
import com.olvind.mui.muiMaterial.muiMaterialStrings.end
import com.olvind.mui.muiMaterial.muiMaterialStrings.start
import com.olvind.mui.muiMaterial.muiMaterialStrings.top
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
trait IconPosition extends StObject {
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[Null] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTabClasses] = js.native
  
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
    * The icon to display.
    */
  var icon: js.UndefOr[String | Element] = js.native
  
  /**
    * The position of the icon relative to the label.
    * @default 'top'
    */
  var iconPosition: js.UndefOr[top | bottom | start | end] = js.native
  
  /**
    * The label element.
    */
  var label: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * You can provide your own value. Otherwise, we fallback to the child position index.
    */
  var value: js.UndefOr[Any] = js.native
  
  /**
    * Tab labels appear in a single row.
    * They can use a second line if needed.
    * @default false
    */
  var wrapped: js.UndefOr[Boolean] = js.native
}
object IconPosition {
  
  @scala.inline
  def apply(): IconPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconPosition]
  }
  
  @scala.inline
  implicit class IconPositionMutableBuilder[Self <: IconPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: PartialTabClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPosition(value: top | bottom | start | end): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value :_*))
    
    @scala.inline
    def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
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
    def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
  }
}
