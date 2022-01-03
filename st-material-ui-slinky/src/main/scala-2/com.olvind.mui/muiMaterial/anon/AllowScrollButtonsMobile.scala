package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialBooleans.`false`
import com.olvind.mui.muiMaterial.muiMaterialBooleans.`true`
import com.olvind.mui.muiMaterial.muiMaterialStrings.auto
import com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.scrollable
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsActions
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowScrollButtonsMobile extends StObject {
  
  /**
    * The component used to render the scroll buttons.
    * @default TabScrollButton
    */
  var ScrollButtonComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * Props applied to the tab indicator element.
    * @default  {}
    */
  var TabIndicatorProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  /**
    * Props applied to the [`TabScrollButton`](/api/tab-scroll-button/) element.
    * @default {}
    */
  var TabScrollButtonProps: js.UndefOr[PartialTabScrollButtonProps] = js.native
  
  /**
    * Callback fired when the component mounts.
    * This is useful when you want to trigger an action programmatically.
    * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
    *
    * @param {object} actions This object contains all possible actions
    * that can be triggered programmatically.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[TabsActions]] = js.native
  
  /**
    * If `true`, the scroll buttons aren't forced hidden on mobile.
    * By default the scroll buttons are hidden on mobile and takes precedence over `scrollButtons`.
    * @default false
    */
  var allowScrollButtonsMobile: js.UndefOr[Boolean] = js.native
  
  /**
    * The label for the Tabs as a string.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  
  /**
    * An id or list of ids separated by a space that label the Tabs.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the tabs are centered.
    * This prop is intended for large views.
    * @default false
    */
  var centered: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTabsClasses] = js.native
  
  /**
    * Determines the color of the indicator.
    * @default 'primary'
    */
  var indicatorColor: js.UndefOr[secondary | primary] = js.native
  
  /**
    * Callback fired when the value changes.
    *
    * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
    * @param {any} value We default to the index of the child (number)
    */
  var onChange: js.UndefOr[js.Function2[/* event */ SyntheticEvent[Event, Element], /* value */ Any, Unit]] = js.native
  
  /**
    * The component orientation (layout flow direction).
    * @default 'horizontal'
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
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
  var scrollButtons: js.UndefOr[auto | `true` | `false`] = js.native
  
  /**
    * If `true` the selected tab changes on focus. Otherwise it only
    * changes on activation.
    */
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * Determines the color of the `Tab`.
    * @default 'primary'
    */
  var textColor: js.UndefOr[secondary | primary | inherit] = js.native
  
  /**
    * The value of the currently selected `Tab`.
    * If you don't want any selected `Tab`, you can set this prop to `false`.
    */
  var value: js.UndefOr[Any] = js.native
  
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
  var variant: js.UndefOr[standard | scrollable | fullWidth] = js.native
  
  /**
    * If `true`, the scrollbar is visible. It can be useful when displaying
    * a long vertical list of tabs.
    * @default false
    */
  var visibleScrollbar: js.UndefOr[Boolean] = js.native
}
object AllowScrollButtonsMobile {
  
  @scala.inline
  def apply(): AllowScrollButtonsMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowScrollButtonsMobile]
  }
  
  @scala.inline
  implicit class AllowScrollButtonsMobileMutableBuilder[Self <: AllowScrollButtonsMobile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: com.olvind.mui.react.mod.Ref[TabsActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionFunction1(value: /* instance */ TabsActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionReactRef(value: ReactRef[TabsActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllowScrollButtonsMobile(value: Boolean): Self = StObject.set(x, "allowScrollButtonsMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowScrollButtonsMobileUndefined: Self = StObject.set(x, "allowScrollButtonsMobile", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialTabsClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setIndicatorColor(value: secondary | primary): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorColorUndefined: Self = StObject.set(x, "indicatorColor", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ SyntheticEvent[Event, Element], /* value */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setScrollButtonComponent(value: ReactElement): Self = StObject.set(x, "ScrollButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollButtonComponentUndefined: Self = StObject.set(x, "ScrollButtonComponent", js.undefined)
    
    @scala.inline
    def setScrollButtons(value: auto | `true` | `false`): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollButtonsUndefined: Self = StObject.set(x, "scrollButtons", js.undefined)
    
    @scala.inline
    def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
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
    def setTabIndicatorProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "TabIndicatorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndicatorPropsUndefined: Self = StObject.set(x, "TabIndicatorProps", js.undefined)
    
    @scala.inline
    def setTabScrollButtonProps(value: PartialTabScrollButtonProps): Self = StObject.set(x, "TabScrollButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabScrollButtonPropsUndefined: Self = StObject.set(x, "TabScrollButtonProps", js.undefined)
    
    @scala.inline
    def setTextColor(value: secondary | primary | inherit): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVariant(value: standard | scrollable | fullWidth): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    @scala.inline
    def setVisibleScrollbar(value: Boolean): Self = StObject.set(x, "visibleScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleScrollbarUndefined: Self = StObject.set(x, "visibleScrollbar", js.undefined)
  }
}
