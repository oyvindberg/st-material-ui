package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsActions
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowScrollButtonsMobile extends StObject {
  
  /**
    * The component used to render the scroll buttons.
    * @default TabScrollButton
    */
  var ScrollButtonComponent: js.UndefOr[ElementType] = js.undefined
  
  /**
    * Props applied to the tab indicator element.
    * @default  {}
    */
  var TabIndicatorProps: js.UndefOr[HTMLAttributesHTMLDivElement] = js.undefined
  
  /**
    * Props applied to the [`TabScrollButton`](/material-ui/api/tab-scroll-button/) element.
    * @default {}
    */
  var TabScrollButtonProps: js.UndefOr[PartialTabScrollButtonProps] = js.undefined
  
  /**
    * Callback fired when the component mounts.
    * This is useful when you want to trigger an action programmatically.
    * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
    *
    * @param {object} actions This object contains all possible actions
    * that can be triggered programmatically.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[TabsActions]] = js.undefined
  
  /**
    * If `true`, the scroll buttons aren't forced hidden on mobile.
    * By default the scroll buttons are hidden on mobile and takes precedence over `scrollButtons`.
    * @default false
    */
  var allowScrollButtonsMobile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label for the Tabs as a string.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * An id or list of ids separated by a space that label the Tabs.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the tabs are centered.
    * This prop is intended for large views.
    * @default false
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTabsClasses] = js.undefined
  
  /**
    * Determines the color of the indicator.
    * @default 'primary'
    */
  var indicatorColor: js.UndefOr["secondary" | "primary"] = js.undefined
  
  /**
    * Callback fired when the value changes.
    *
    * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
    * @param {any} value We default to the index of the child (number)
    */
  var onChange: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* value */ Any, Unit]] = js.undefined
  
  /**
    * The component orientation (layout flow direction).
    * @default 'horizontal'
    */
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  /**
    * Determine behavior of scroll buttons when tabs are set to scroll:
    *
    * - `auto` will only present them when not all the items are visible.
    * - `true` will always present them.
    * - `false` will never present them.
    *
    * By default the scroll buttons are hidden on mobile.
    * This behavior can be disabled with `allowScrollButtonsMobile`.
    * @default 'auto'
    */
  var scrollButtons: js.UndefOr["auto" | true | false] = js.undefined
  
  /**
    * If `true` the selected tab changes on focus. Otherwise it only
    * changes on activation.
    */
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    * @default {}
    */
  var slotProps: js.UndefOr[EndScrollButtonIconStartScrollButtonIcon] = js.undefined
  
  /**
    * The components used for each slot inside.
    * @default {}
    */
  var slots: js.UndefOr[EndScrollButtonIcon] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * Determines the color of the `Tab`.
    * @default 'primary'
    */
  var textColor: js.UndefOr["secondary" | "primary" | "inherit"] = js.undefined
  
  /**
    * The value of the currently selected `Tab`.
    * If you don't want any selected `Tab`, you can set this prop to `false`.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    *  Determines additional display behavior of the tabs:
    *
    *  - `scrollable` will invoke scrolling properties and allow for horizontally
    *  scrolling (or swiping) of the tab bar.
    *  -`fullWidth` will make the tabs grow to use all the available space,
    *  which should be used for small views, like on mobile.
    *  - `standard` will render the default state.
    * @default 'standard'
    */
  var variant: js.UndefOr["standard" | "scrollable" | "fullWidth"] = js.undefined
  
  /**
    * If `true`, the scrollbar is visible. It can be useful when displaying
    * a long vertical list of tabs.
    * @default false
    */
  var visibleScrollbar: js.UndefOr[Boolean] = js.undefined
}
object AllowScrollButtonsMobile {
  
  inline def apply(): AllowScrollButtonsMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowScrollButtonsMobile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowScrollButtonsMobile] (val x: Self) extends AnyVal {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[TabsActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: TabsActions | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: TabsActions | Null) => value(t0).runNow()))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllowScrollButtonsMobile(value: Boolean): Self = StObject.set(x, "allowScrollButtonsMobile", value.asInstanceOf[js.Any])
    
    inline def setAllowScrollButtonsMobileUndefined: Self = StObject.set(x, "allowScrollButtonsMobile", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialTabsClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setIndicatorColor(value: "secondary" | "primary"): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    inline def setIndicatorColorUndefined: Self = StObject.set(x, "indicatorColor", js.undefined)
    
    inline def setOnChange(value: (/* event */ ReactEventFrom[Element], /* value */ Any) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScrollButtonComponent(value: ElementType): Self = StObject.set(x, "ScrollButtonComponent", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonComponentUndefined: Self = StObject.set(x, "ScrollButtonComponent", js.undefined)
    
    inline def setScrollButtons(value: "auto" | true | false): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonsUndefined: Self = StObject.set(x, "scrollButtons", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setSlotProps(value: EndScrollButtonIconStartScrollButtonIcon): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: EndScrollButtonIcon): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTabIndicatorProps(value: HTMLAttributesHTMLDivElement): Self = StObject.set(x, "TabIndicatorProps", value.asInstanceOf[js.Any])
    
    inline def setTabIndicatorPropsUndefined: Self = StObject.set(x, "TabIndicatorProps", js.undefined)
    
    inline def setTabScrollButtonProps(value: PartialTabScrollButtonProps): Self = StObject.set(x, "TabScrollButtonProps", value.asInstanceOf[js.Any])
    
    inline def setTabScrollButtonPropsUndefined: Self = StObject.set(x, "TabScrollButtonProps", js.undefined)
    
    inline def setTextColor(value: "secondary" | "primary" | "inherit"): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: "standard" | "scrollable" | "fullWidth"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVisibleScrollbar(value: Boolean): Self = StObject.set(x, "visibleScrollbar", value.asInstanceOf[js.Any])
    
    inline def setVisibleScrollbarUndefined: Self = StObject.set(x, "visibleScrollbar", js.undefined)
  }
}
