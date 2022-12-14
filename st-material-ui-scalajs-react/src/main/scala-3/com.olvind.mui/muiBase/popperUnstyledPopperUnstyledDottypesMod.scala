package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.`5`
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperUnstyledPopperUnstyledDottypesMod {
  
  type PopperPlacementType = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['placement'] */ js.Any
  
  trait PopperUnstyledChildrenProps extends StObject {
    
    var TransitionProps: js.UndefOr[PopperUnstyledTransitionProps] = js.undefined
    
    var placement: PopperPlacementType
  }
  object PopperUnstyledChildrenProps {
    
    inline def apply(placement: PopperPlacementType): PopperUnstyledChildrenProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperUnstyledChildrenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledChildrenProps] (val x: Self) extends AnyVal {
      
      inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setTransitionProps(value: PopperUnstyledTransitionProps): Self = StObject.set(x, "TransitionProps", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropsUndefined: Self = StObject.set(x, "TransitionProps", js.undefined)
    }
  }
  
  trait PopperUnstyledOwnProps extends StObject {
    
    /**
      * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
      * or a function that returns either.
      * It's used to set the position of the popper.
      * The return value will passed as the reference object of the Popper instance.
      */
    var anchorEl: js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
        ])
      ] = js.undefined
    
    /**
      * Popper render function or node.
      */
    var children: js.UndefOr[Node | (js.Function1[/* props */ PopperUnstyledChildrenProps, Node])] = js.undefined
    
    /**
      * An HTML element or function that returns one.
      * The `container` will have the portal children appended to it.
      *
      * By default, it uses the body of the top-level document object,
      * so it's simply `document.body` most of the time.
      */
    var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.undefined
    
    /**
      * Direction of the text.
      * @default 'ltr'
      */
    var direction: js.UndefOr["ltr" | "rtl"] = js.undefined
    
    /**
      * The `children` will be under the DOM hierarchy of the parent component.
      * @default false
      */
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Always keep the children in the DOM.
      * This prop can be useful in SEO situation or
      * when you want to maximize the responsiveness of the Popper.
      * @default false
      */
    var keepMounted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Popper.js is based on a "plugin-like" architecture,
      * most of its features are fully encapsulated "modifiers".
      *
      * A modifier is a function that is called each time Popper.js needs to
      * compute the position of the popper.
      * For this reason, modifiers should be very performant to avoid bottlenecks.
      * To learn how to create a modifier, [read the modifiers documentation](https://popper.js.org/docs/v2/modifiers/).
      */
    var modifiers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
      ] = js.undefined
    
    /**
      * If `true`, the component is shown.
      */
    var open: Boolean
    
    var ownerState: js.UndefOr[Any] = js.undefined
    
    /**
      * Popper placement.
      * @default 'bottom'
      */
    var placement: js.UndefOr[PopperPlacementType] = js.undefined
    
    /**
      * Options provided to the [`Popper.js`](https://popper.js.org/docs/v2/constructors/#options) instance.
      * @default {}
      */
    var popperOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * A ref that points to the used popper instance.
      */
    var popperRef: js.UndefOr[
        Ref[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
      ] = js.undefined
    
    /**
      * The props used for each slot inside the Popper.
      * @default {}
      */
    var slotProps: js.UndefOr[`5`] = js.undefined
    
    /**
      * The components used for each slot inside the Popper.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[PopperUnstyledSlots] = js.undefined
    
    /**
      * Help supporting a react-transition-group/Transition component.
      * @default false
      */
    var transition: js.UndefOr[Boolean] = js.undefined
  }
  object PopperUnstyledOwnProps {
    
    inline def apply(open: Boolean): PopperUnstyledOwnProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElCallbackTo(
        value: CallbackTo[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
            ]
      ): Self = StObject.set(x, "anchorEl", value.toJsFn)
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: Node | (js.Function1[/* props */ PopperUnstyledChildrenProps, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ PopperUnstyledChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDirection(value: "ltr" | "rtl"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      inline def setModifiers(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOwnerState(value: Any): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
      
      inline def setOwnerStateUndefined: Self = StObject.set(x, "ownerState", js.undefined)
      
      inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      inline def setPopperRef(
        value: Ref[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
            ]
      ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
      
      inline def setPopperRefFunction1(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null => Callback
      ): Self = StObject.set(x, "popperRef", js.Any.fromFunction1((t0: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null) => value(t0).runNow()))
      
      inline def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
      
      inline def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
      
      inline def setSlotProps(value: `5`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: PopperUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@mui/base.@mui/base/PopperUnstyled/PopperUnstyled.types.PopperUnstyledOwnProps, 'ownerState'> */
  trait PopperUnstyledOwnerState extends StObject {
    
    var anchorEl: js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
        ])
      ] = js.undefined
    
    var children: js.UndefOr[Node | (js.Function1[/* props */ PopperUnstyledChildrenProps, Node])] = js.undefined
    
    var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.undefined
    
    var direction: js.UndefOr["ltr" | "rtl"] = js.undefined
    
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    var keepMounted: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
      ] = js.undefined
    
    var open: Boolean
    
    var placement: js.UndefOr[PopperPlacementType] = js.undefined
    
    var popperOptions: js.UndefOr[js.Object] = js.undefined
    
    var popperRef: js.UndefOr[
        Ref[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
      ] = js.undefined
    
    var slotProps: js.UndefOr[`5`] = js.undefined
    
    var slots: js.UndefOr[PopperUnstyledSlots] = js.undefined
    
    var transition: js.UndefOr[Boolean] = js.undefined
  }
  object PopperUnstyledOwnerState {
    
    inline def apply(open: Boolean): PopperUnstyledOwnerState = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperUnstyledOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledOwnerState] (val x: Self) extends AnyVal {
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElCallbackTo(
        value: CallbackTo[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
            ]
      ): Self = StObject.set(x, "anchorEl", value.toJsFn)
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: Node | (js.Function1[/* props */ PopperUnstyledChildrenProps, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ PopperUnstyledChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDirection(value: "ltr" | "rtl"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      inline def setModifiers(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      inline def setPopperRef(
        value: Ref[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
            ]
      ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
      
      inline def setPopperRefFunction1(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null => Callback
      ): Self = StObject.set(x, "popperRef", js.Any.fromFunction1((t0: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null) => value(t0).runNow()))
      
      inline def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
      
      inline def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
      
      inline def setSlotProps(value: `5`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: PopperUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait PopperUnstyledRootSlotPropsOverrides extends StObject
  
  trait PopperUnstyledSlots extends StObject {
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: js.UndefOr[ElementType] = js.undefined
  }
  object PopperUnstyledSlots {
    
    inline def apply(): PopperUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait PopperUnstyledTransitionProps extends StObject {
    
    var in: Boolean
    
    def onEnter(): Unit
    
    def onExited(): Unit
  }
  object PopperUnstyledTransitionProps {
    
    inline def apply(in: Boolean, onEnter: Callback, onExited: Callback): PopperUnstyledTransitionProps = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onEnter = onEnter.toJsFn, onExited = onExited.toJsFn)
      __obj.asInstanceOf[PopperUnstyledTransitionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledTransitionProps] (val x: Self) extends AnyVal {
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setOnEnter(value: Callback): Self = StObject.set(x, "onEnter", value.toJsFn)
      
      inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    }
  }
  
  trait PopperUnstyledTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & PopperUnstyledOwnProps
  }
  object PopperUnstyledTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & PopperUnstyledOwnProps): PopperUnstyledTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperUnstyledTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperUnstyledTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (PopperUnstyledTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & PopperUnstyledOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
