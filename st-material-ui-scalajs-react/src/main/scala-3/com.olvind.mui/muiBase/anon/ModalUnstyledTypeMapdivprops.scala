package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.backdropClick
import com.olvind.mui.muiBase.muiBaseStrings.escapeKeyDown
import com.olvind.mui.react.mod.ReactEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/ModalUnstyled/ModalUnstyled.ModalUnstyledTypeMap<{}, 'div'>['props'] */
trait ModalUnstyledTypeMapdivprops extends StObject {
  
  /**
    * A backdrop component. This prop enables custom backdrop rendering.
    */
  var BackdropComponent: js.UndefOr[ElementType] = js.undefined
  
  /**
    * Props applied to the [`BackdropUnstyled`](/api/backdrop-unstyled/) element.
    */
  var BackdropProps: js.UndefOr[PartialBackdropUnstyledPropsBackdropUnst] = js.undefined
  
  /**
    * A single child content element.
    */
  var children: Element
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialModalUnstyledClasses] = js.undefined
  
  /**
    * When set to true the Modal waits until a nested Transition is completed before closing.
    * @default false
    */
  var closeAfterTransition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The components used for each slot inside the Modal.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var components: js.UndefOr[Root] = js.undefined
  
  /**
    * The props used for each slot inside the Modal.
    * @default {}
    */
  var componentsProps: js.UndefOr[`4`] = js.undefined
  
  /**
    * An HTML element or function that returns one.
    * The `container` will have the portal children appended to it.
    *
    * By default, it uses the body of the top-level document object,
    * so it's simply `document.body` most of the time.
    */
  var container: js.UndefOr[org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null]) | Null] = js.undefined
  
  /**
    * If `true`, the modal will not automatically shift focus to itself when it opens, and
    * replace it to the last focused element when it closes.
    * This also works correctly with any modal children that have the `disableAutoFocus` prop.
    *
    * Generally this should never be set to `true` as it makes the modal less
    * accessible to assistive technologies, like screen readers.
    * @default false
    */
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the modal will not prevent focus from leaving the modal while open.
    *
    * Generally this should never be set to `true` as it makes the modal less
    * accessible to assistive technologies, like screen readers.
    * @default false
    */
  var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, hitting escape will not fire the `onClose` callback.
    * @default false
    */
  var disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `children` will be under the DOM hierarchy of the parent component.
    * @default false
    */
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the modal will not restore focus to previously focused element once
    * modal is hidden.
    * @default false
    */
  var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the scroll lock behavior.
    * @default false
    */
  var disableScrollLock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the backdrop is not rendered.
    * @default false
    */
  var hideBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Always keep the children in the DOM.
    * This prop can be useful in SEO situation or
    * when you want to maximize the responsiveness of the Modal.
    * @default false
    */
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback fired when the backdrop is clicked.
    */
  var onBackdropClick: js.UndefOr[ReactEventHandler[js.Object]] = js.undefined
  
  /**
    * Callback fired when the component requests to be closed.
    * The `reason` parameter can optionally be used to control the response to `onClose`.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ js.Object, /* reason */ backdropClick | escapeKeyDown, Unit]
  ] = js.undefined
  
  /**
    * If `true`, the component is shown.
    */
  var open: Boolean
}
object ModalUnstyledTypeMapdivprops {
  
  inline def apply(children: VdomElement, open: Boolean): ModalUnstyledTypeMapdivprops = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalUnstyledTypeMapdivprops]
  }
  
  extension [Self <: ModalUnstyledTypeMapdivprops](x: Self) {
    
    inline def setBackdropComponent(value: ElementType): Self = StObject.set(x, "BackdropComponent", value.asInstanceOf[js.Any])
    
    inline def setBackdropComponentUndefined: Self = StObject.set(x, "BackdropComponent", js.undefined)
    
    inline def setBackdropProps(value: PartialBackdropUnstyledPropsBackdropUnst): Self = StObject.set(x, "BackdropProps", value.asInstanceOf[js.Any])
    
    inline def setBackdropPropsUndefined: Self = StObject.set(x, "BackdropProps", js.undefined)
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialModalUnstyledClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCloseAfterTransition(value: Boolean): Self = StObject.set(x, "closeAfterTransition", value.asInstanceOf[js.Any])
    
    inline def setCloseAfterTransitionUndefined: Self = StObject.set(x, "closeAfterTransition", js.undefined)
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: `4`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setContainer(value: org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerCallbackTo(value: CallbackTo[org.scalajs.dom.Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
    
    inline def setDisableEnforceFocus(value: Boolean): Self = StObject.set(x, "disableEnforceFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableEnforceFocusUndefined: Self = StObject.set(x, "disableEnforceFocus", js.undefined)
    
    inline def setDisableEscapeKeyDown(value: Boolean): Self = StObject.set(x, "disableEscapeKeyDown", value.asInstanceOf[js.Any])
    
    inline def setDisableEscapeKeyDownUndefined: Self = StObject.set(x, "disableEscapeKeyDown", js.undefined)
    
    inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
    
    inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    
    inline def setDisableRestoreFocus(value: Boolean): Self = StObject.set(x, "disableRestoreFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableRestoreFocusUndefined: Self = StObject.set(x, "disableRestoreFocus", js.undefined)
    
    inline def setDisableScrollLock(value: Boolean): Self = StObject.set(x, "disableScrollLock", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollLockUndefined: Self = StObject.set(x, "disableScrollLock", js.undefined)
    
    inline def setHideBackdrop(value: Boolean): Self = StObject.set(x, "hideBackdrop", value.asInstanceOf[js.Any])
    
    inline def setHideBackdropUndefined: Self = StObject.set(x, "hideBackdrop", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setOnBackdropClick(value: ReactEventFrom[js.Object & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1((t0: ReactEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
    
    inline def setOnClose(value: (/* event */ js.Object, /* reason */ backdropClick | escapeKeyDown) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ js.Object, t1: /* reason */ backdropClick | escapeKeyDown) => (value(t0, t1)).runNow()))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
