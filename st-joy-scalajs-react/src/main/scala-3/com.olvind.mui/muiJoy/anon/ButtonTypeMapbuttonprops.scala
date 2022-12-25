package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonPropsColorOverrides
import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonPropsSizeOverrides
import com.olvind.mui.muiJoy.buttonButtonPropsMod.ButtonPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/joy.@mui/joy/Button/ButtonProps.ButtonTypeMap<{}, 'button'>['props'] */
trait ButtonTypeMapbuttonprops extends StObject {
  
  /**
    * A ref for imperative actions. It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[FocusVisible]] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, ButtonPropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * This prop can help identify which element has keyboard focus.
    * The class name will be applied when the element gains the focus through keyboard interaction.
    * It's a polyfill for the [CSS :focus-visible selector](https://drafts.csswg.org/selectors-4/#the-focus-visible-pseudo).
    * The rationale for using this feature [is explained here](https://github.com/WICG/focus-visible/blob/HEAD/explainer.md).
    * A [polyfill can be used](https://github.com/WICG/focus-visible) to apply a `focus-visible` class to other components
    * if needed.
    */
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the button will take up the full width of its container.
    * @default false
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the loading indicator is shown.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The node should contain an element with `role="progressbar"` with an accessible name.
    * By default we render a `CircularProgress` that is labelled by the button itself.
    * @default <CircularProgress />
    */
  var loadingIndicator: js.UndefOr[Node] = js.undefined
  
  /**
    * The loading indicator can be positioned on the start, end, or the center of the button.
    * @default 'center'
    */
  var loadingPosition: js.UndefOr["start" | "end" | "center"] = js.undefined
  
  /**
    * The size of the component.
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", ButtonPropsSizeOverrides]] = js.undefined
  
  var slotProps: js.UndefOr[EndDecoratorLoadingIndicatorCenter] = js.undefined
  
  var slots: js.UndefOr[LoadingIndicatorCenter] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * @default 0
    */
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
  
  /**
    * The variant to use.
    * @default 'solid'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, ButtonPropsVariantOverrides]] = js.undefined
}
object ButtonTypeMapbuttonprops {
  
  inline def apply(): ButtonTypeMapbuttonprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonTypeMapbuttonprops]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonTypeMapbuttonprops] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[FocusVisible]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: FocusVisible | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: FocusVisible | Null) => value(t0).runNow()))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, ButtonPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
    
    inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicator(value: VdomNode): Self = StObject.set(x, "loadingIndicator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorNull: Self = StObject.set(x, "loadingIndicator", null)
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setLoadingIndicatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingIndicator", js.Array(value*))
    
    inline def setLoadingIndicatorVdomElement(value: VdomElement): Self = StObject.set(x, "loadingIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLoadingPosition(value: "start" | "end" | "center"): Self = StObject.set(x, "loadingPosition", value.asInstanceOf[js.Any])
    
    inline def setLoadingPositionUndefined: Self = StObject.set(x, "loadingPosition", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", ButtonPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlotProps(value: EndDecoratorLoadingIndicatorCenter): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: LoadingIndicatorCenter): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
    
    inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, ButtonPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
