package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipPropsColorOverrides
import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipPropsSizeOverrides
import com.olvind.mui.muiJoy.tooltipTooltipPropsMod.TooltipPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChild extends StObject {
  
  /**
    * If `true`, adds an arrow to the tooltip.
    * @default false
    */
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tooltip reference element.
    */
  var children: ReactElement
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TooltipPropsColorOverrides]] = js.undefined
  
  /**
    * Set to `true` if the `title` acts as an accessible description.
    * By default the `title` acts as an accessible label for the child.
    * @default false
    */
  var describeChild: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not respond to focus-visible events.
    * @default false
    */
  var disableFocusListener: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not respond to hover events.
    * @default false
    */
  var disableHoverListener: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Makes a tooltip not interactive, i.e. it will close when the user
    * hovers over the tooltip before the `leaveDelay` is expired.
    * @default false
    */
  var disableInteractive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not respond to long press touch events.
    * @default false
    */
  var disableTouchListener: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of milliseconds to wait before showing the tooltip.
    * This prop won't impact the enter touch delay (`enterTouchDelay`).
    * @default 100
    */
  var enterDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds to wait before showing the tooltip when one was already recently opened.
    * @default 0
    */
  var enterNextDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds a user must touch the element before showing the tooltip.
    * @default 700
    */
  var enterTouchDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the tooltip follow the cursor over the wrapped element.
    * @default false
    */
  var followCursor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This prop is used to help implement the accessibility logic.
    * If you don't provide this prop. It falls back to a randomly generated id.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The number of milliseconds to wait before hiding the tooltip.
    * This prop won't impact the leave touch delay (`leaveTouchDelay`).
    * @default 0
    */
  var leaveDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds after the user stops touching an element before hiding the tooltip.
    * @default 1500
    */
  var leaveTouchDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback fired when the component requests to be closed.
    *
    * @param {React.SyntheticEvent} event The event source of the callback.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ (SyntheticEvent[Event, Element]) | Event, Unit]] = js.undefined
  
  /**
    * Callback fired when the component requests to be open.
    *
    * @param {React.SyntheticEvent} event The event source of the callback.
    */
  var onOpen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.undefined
  
  /**
    * If `true`, the component is shown.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tooltip placement.
    * @default 'bottom'
    */
  var placement: js.UndefOr[
    "bottom-end" | "bottom-start" | "bottom" | "left-end" | "left-start" | "left" | "right-end" | "right-start" | "right" | "top-end" | "top-start" | "top"
  ] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", TooltipPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * Tooltip title. Zero-length titles string, undefined, null and false are never displayed.
    */
  var title: ReactElement
  
  /**
    * The variant to use.
    * @default 'soft'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TooltipPropsVariantOverrides]] = js.undefined
}
object DescribeChild {
  
  inline def apply(children: ReactElement, title: ReactElement): DescribeChild = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChild] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TooltipPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDescribeChild(value: Boolean): Self = StObject.set(x, "describeChild", value.asInstanceOf[js.Any])
    
    inline def setDescribeChildUndefined: Self = StObject.set(x, "describeChild", js.undefined)
    
    inline def setDisableFocusListener(value: Boolean): Self = StObject.set(x, "disableFocusListener", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusListenerUndefined: Self = StObject.set(x, "disableFocusListener", js.undefined)
    
    inline def setDisableHoverListener(value: Boolean): Self = StObject.set(x, "disableHoverListener", value.asInstanceOf[js.Any])
    
    inline def setDisableHoverListenerUndefined: Self = StObject.set(x, "disableHoverListener", js.undefined)
    
    inline def setDisableInteractive(value: Boolean): Self = StObject.set(x, "disableInteractive", value.asInstanceOf[js.Any])
    
    inline def setDisableInteractiveUndefined: Self = StObject.set(x, "disableInteractive", js.undefined)
    
    inline def setDisableTouchListener(value: Boolean): Self = StObject.set(x, "disableTouchListener", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchListenerUndefined: Self = StObject.set(x, "disableTouchListener", js.undefined)
    
    inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
    
    inline def setEnterNextDelay(value: Double): Self = StObject.set(x, "enterNextDelay", value.asInstanceOf[js.Any])
    
    inline def setEnterNextDelayUndefined: Self = StObject.set(x, "enterNextDelay", js.undefined)
    
    inline def setEnterTouchDelay(value: Double): Self = StObject.set(x, "enterTouchDelay", value.asInstanceOf[js.Any])
    
    inline def setEnterTouchDelayUndefined: Self = StObject.set(x, "enterTouchDelay", js.undefined)
    
    inline def setFollowCursor(value: Boolean): Self = StObject.set(x, "followCursor", value.asInstanceOf[js.Any])
    
    inline def setFollowCursorUndefined: Self = StObject.set(x, "followCursor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeaveDelay(value: Double): Self = StObject.set(x, "leaveDelay", value.asInstanceOf[js.Any])
    
    inline def setLeaveDelayUndefined: Self = StObject.set(x, "leaveDelay", js.undefined)
    
    inline def setLeaveTouchDelay(value: Double): Self = StObject.set(x, "leaveTouchDelay", value.asInstanceOf[js.Any])
    
    inline def setLeaveTouchDelayUndefined: Self = StObject.set(x, "leaveTouchDelay", js.undefined)
    
    inline def setOnClose(value: /* event */ (SyntheticEvent[Event, Element]) | Event => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPlacement(
      value: "bottom-end" | "bottom-start" | "bottom" | "left-end" | "left-start" | "left" | "right-end" | "right-start" | "right" | "top-end" | "top-start" | "top"
    ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", TooltipPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
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
    
    inline def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TooltipPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
