package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<ButtonBaseTypeMap<{}, 'button'>['props'], 'classes'> */
@js.native
trait OmitButtonBaseTypeMapbuttonpropsclasses extends StObject {
  
  var LinkComponent: js.UndefOr[ElementType] = js.native
  
  var TouchRippleProps: js.UndefOr[PartialTouchRippleProps] = js.native
  
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonBaseActions]] = js.native
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusRipple: js.UndefOr[Boolean] = js.native
  
  var focusVisibleClassName: js.UndefOr[String] = js.native
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[Any]] = js.native
  
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.native
}
object OmitButtonBaseTypeMapbuttonpropsclasses {
  
  @scala.inline
  def apply(): OmitButtonBaseTypeMapbuttonpropsclasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitButtonBaseTypeMapbuttonpropsclasses]
  }
  
  @scala.inline
  implicit class OmitButtonBaseTypeMapbuttonpropsclassesMutableBuilder[Self <: OmitButtonBaseTypeMapbuttonpropsclasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: com.olvind.mui.react.mod.Ref[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionFunction1(value: ButtonBaseActions | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: ButtonBaseActions | Null) => value(t0).runNow()))
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
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
    def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    @scala.inline
    def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    @scala.inline
    def setLinkComponent(value: ElementType): Self = StObject.set(x, "LinkComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkComponentUndefined: Self = StObject.set(x, "LinkComponent", js.undefined)
    
    @scala.inline
    def setOnFocusVisible(value: ReactFocusEventFrom[Any with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with org.scalajs.dom.Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
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
    def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTouchRippleProps(value: PartialTouchRippleProps): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
  }
}
