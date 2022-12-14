package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledDottypesMod.PopperPlacementType
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledDottypesMod.PopperUnstyledChildrenProps
import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectPropsColorOverrides
import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectPropsSizeOverrides
import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Select/SelectProps.SelectPropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Select/SelectProps.SelectPropsVariantOverrides> | undefined,   size :@mui/types.@mui/types.OverridableStringUnion<'sm' | 'md' | 'lg', @mui/joy.@mui/joy/Select/SelectProps.SelectPropsSizeOverrides> | undefined} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'> */
trait OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl extends StObject {
  
  var anchorEl: js.UndefOr[
    Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
    ])
  ] = js.undefined
  
  var children: js.UndefOr[
    ReactElement | (js.Function1[/* props */ PopperUnstyledChildrenProps, ReactElement])
  ] = js.undefined
  
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, SelectPropsColorOverrides]] = js.undefined
  
  var container: js.UndefOr[Element | (js.Function0[Element | Null]) | Null] = js.undefined
  
  var direction: js.UndefOr["ltr" | "rtl"] = js.undefined
  
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
  ] = js.undefined
  
  var ownerState: js.UndefOr[Any] = js.undefined
  
  var placement: js.UndefOr[PopperPlacementType] = js.undefined
  
  var popperOptions: js.UndefOr[js.Object] = js.undefined
  
  var popperRef: js.UndefOr[
    com.olvind.mui.react.mod.Ref[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
    ]
  ] = js.undefined
  
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", SelectPropsSizeOverrides]] = js.undefined
  
  var transition: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, SelectPropsVariantOverrides]] = js.undefined
}
object OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl {
  
  inline def apply(): OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitPopperUnstyledOwnPropsslotsslotPropsAnchorEl] (val x: Self) extends AnyVal {
    
    inline def setAnchorEl(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
        ])
    ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    inline def setAnchorElFunction0(
      value: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
    ): Self = StObject.set(x, "anchorEl", js.Any.fromFunction0(value))
    
    inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    inline def setChildren(value: ReactElement | (js.Function1[/* props */ PopperUnstyledChildrenProps, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ PopperUnstyledChildrenProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, SelectPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainer(value: Element | (js.Function0[Element | Null])): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerFunction0(value: () => Element | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
    
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
    
    inline def setOwnerState(value: Any): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
    
    inline def setOwnerStateUndefined: Self = StObject.set(x, "ownerState", js.undefined)
    
    inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    inline def setPopperRef(
      value: com.olvind.mui.react.mod.Ref[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
    ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
    
    inline def setPopperRefFunction1(
      value: /* instance */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any) | Null => Unit
    ): Self = StObject.set(x, "popperRef", js.Any.fromFunction1(value))
    
    inline def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
    
    inline def setPopperRefReactRef(
      value: ReactRef[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instance */ Any
        ]
    ): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
    
    inline def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", SelectPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, SelectPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
