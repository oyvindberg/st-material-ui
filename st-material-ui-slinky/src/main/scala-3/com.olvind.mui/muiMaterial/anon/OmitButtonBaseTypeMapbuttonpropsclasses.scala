package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiMaterial.buttonBaseTouchRippleMod.TouchRippleActions
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.std.NonNullable
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<ButtonBaseTypeMap<{}, 'button'>['props'], 'classes'> */
trait OmitButtonBaseTypeMapbuttonpropsclasses extends StObject {
  
  var LinkComponent: js.UndefOr[ReactElement] = js.undefined
  
  var TouchRippleProps: js.UndefOr[PartialTouchRippleProps] = js.undefined
  
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonBaseActions]] = js.undefined
  
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var focusRipple: js.UndefOr[Boolean] = js.undefined
  
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
  
  var touchRippleRef: js.UndefOr[com.olvind.mui.react.mod.Ref[TouchRippleActions]] = js.undefined
}
object OmitButtonBaseTypeMapbuttonpropsclasses {
  
  inline def apply(): OmitButtonBaseTypeMapbuttonpropsclasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitButtonBaseTypeMapbuttonpropsclasses]
  }
  
  extension [Self <: OmitButtonBaseTypeMapbuttonpropsclasses](x: Self) {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: /* instance */ ButtonBaseActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionReactRef(value: ReactRef[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    inline def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    inline def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    inline def setLinkComponent(value: ReactElement): Self = StObject.set(x, "LinkComponent", value.asInstanceOf[js.Any])
    
    inline def setLinkComponentUndefined: Self = StObject.set(x, "LinkComponent", js.undefined)
    
    inline def setOnFocusVisible(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
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
    
    inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTouchRippleProps(value: PartialTouchRippleProps): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    inline def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
    
    inline def setTouchRippleRef(value: com.olvind.mui.react.mod.Ref[TouchRippleActions]): Self = StObject.set(x, "touchRippleRef", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleRefFunction1(value: /* instance */ TouchRippleActions | Null => Unit): Self = StObject.set(x, "touchRippleRef", js.Any.fromFunction1(value))
    
    inline def setTouchRippleRefNull: Self = StObject.set(x, "touchRippleRef", null)
    
    inline def setTouchRippleRefReactRef(value: ReactRef[TouchRippleActions]): Self = StObject.set(x, "touchRippleRef", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleRefUndefined: Self = StObject.set(x, "touchRippleRef", js.undefined)
  }
}
