package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.DefaultComponentPropsPopperUnstyledTypeM
import com.olvind.mui.muiBase.anon.Placement
import com.olvind.mui.muiBase.anon.`1`
import com.olvind.mui.muiBase.anon.`7`
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperUnstyledPopperUnstyledMod extends Shortcut {
  
  /**
    * Poppers rely on the 3rd party library [Popper.js](https://popper.js.org/docs/v2/) for positioning.
    *
    * Demos:
    *
    * - [Unstyled Popper](https://mui.com/base/react-popper/)
    *
    * API:
    *
    * - [PopperUnstyled API](https://mui.com/base/api/popper-unstyled/)
    */
  @JSImport("@mui/base/PopperUnstyled/PopperUnstyled", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null] = js.native
  
  type PopperPlacementType = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['placement'] */ js.Any
  
  trait PopperUnstyledComponentsPropsOverrides extends StObject
  
  trait PopperUnstyledOwnProps extends StObject {
    
    /**
      * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
      * or a function that returns either.
      * It's used to set the position of the popper.
      * The return value will passed as the reference object of the Popper instance.
      */
    var anchorEl: js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ])
      ] = js.undefined
    
    /**
      * Popper render function or node.
      */
    var children: js.UndefOr[Node | (js.Function1[/* props */ Placement, Node])] = js.undefined
    
    /**
      * An HTML element or function that returns one.
      * The `container` will have the portal children appended to it.
      *
      * By default, it uses the body of the top-level document object,
      * so it's simply `document.body` most of the time.
      */
    var container: js.UndefOr[org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null]) | Null] = js.undefined
    
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
    var slotProps: js.UndefOr[`7`] = js.undefined
    
    /**
      * The components used for each slot inside the Popper.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[`1`] = js.undefined
    
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
    
    extension [Self <: PopperUnstyledOwnProps](x: Self) {
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElCallbackTo(
        value: CallbackTo[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
            ]
      ): Self = StObject.set(x, "anchorEl", value.toJsFn)
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: Node | (js.Function1[/* props */ Placement, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ Placement => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: org.scalajs.dom.Element | (js.Function0[org.scalajs.dom.Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[org.scalajs.dom.Element | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
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
      
      inline def setSlotProps(value: `7`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type PopperUnstyledOwnerState = PopperUnstyledOwnProps
  
  trait PopperUnstyledTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & PopperUnstyledOwnProps
  }
  object PopperUnstyledTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & PopperUnstyledOwnProps): PopperUnstyledTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperUnstyledTypeMap[P, D]]
    }
    
    extension [Self <: PopperUnstyledTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (PopperUnstyledTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & PopperUnstyledOwnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `popperUnstyledPopperUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsPopperUnstyledTypeM, Element | Null] = default
}
