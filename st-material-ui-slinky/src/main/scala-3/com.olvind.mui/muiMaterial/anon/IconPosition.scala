package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.bottom
import com.olvind.mui.muiMaterial.muiMaterialStrings.end
import com.olvind.mui.muiMaterial.muiMaterialStrings.start
import com.olvind.mui.muiMaterial.muiMaterialStrings.top
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconPosition extends StObject {
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[Null] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTabClasses] = js.undefined
  
  /**
    * If `true`, the  keyboard focus ripple is disabled.
    * @default false
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon to display.
    */
  var icon: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    * The position of the icon relative to the label.
    * @default 'top'
    */
  var iconPosition: js.UndefOr[top | bottom | start | end] = js.undefined
  
  /**
    * The label element.
    */
  var label: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * You can provide your own value. Otherwise, we fallback to the child position index.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * Tab labels appear in a single row.
    * They can use a second line if needed.
    * @default false
    */
  var wrapped: js.UndefOr[Boolean] = js.undefined
}
object IconPosition {
  
  inline def apply(): IconPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconPosition]
  }
  
  extension [Self <: IconPosition](x: Self) {
    
    inline def setClasses(value: PartialTabClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: String | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconPosition(value: top | bottom | start | end): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    inline def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    
    inline def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
  }
}
