package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Ref
import com.olvind.mui.muiMaterial.anon.`26`
import com.olvind.mui.muiMaterial.stylesMod.StyledComponentProps
import com.olvind.mui.muiTypes.mod.DistributiveOmit
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.ComponentPropsWithoutRef
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overridableComponentMod {
  
  type BaseProps[M /* <: OverridableTypeMap */] = (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & CommonProps
  
  trait CommonProps
    extends StObject
       with StyledComponentProps[scala.Nothing] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type DefaultComponentProps[M /* <: OverridableTypeMap */] = BaseProps[M] & (DistributiveOmit[
    ComponentPropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ "className" | "style" | "classes"
  ])
  
  /**
    * Props if `component={Component}` is NOT used.
    */
  type DefaultComponentPropsVer2[M /* <: OverridableTypeMap */] = BaseProps[M] & (DistributiveOmit[
    ComponentPropsWithoutRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ "className" | "style" | "classes"
  ]) & Ref
  
  type OverridableComponent[M /* <: OverridableTypeMap */] = js.Function1[/* props */ DefaultComponentProps[M] & `26`, Element]
  
  trait OverridableTypeMap extends StObject {
    
    var defaultComponent: ElementType
  }
  object OverridableTypeMap {
    
    inline def apply(defaultComponent: ElementType): OverridableTypeMap = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverridableTypeMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverridableTypeMap] (val x: Self) extends AnyVal {
      
      inline def setDefaultComponent(value: ElementType): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type OverrideProps[M /* <: OverridableTypeMap */, C /* <: ElementType */] = BaseProps[M] & (DistributiveOmit[
    ComponentPropsWithRef[C], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ "className" | "style" | "classes"
  ])
  
  /**
    * Props of the component if `component={Component}` is used.
    */
  type OverridePropsVer2[M /* <: OverridableTypeMap */, C /* <: ElementType */] = BaseProps[M] & (DistributiveOmit[
    ComponentPropsWithoutRef[C], 
    /* keyof @mui/material.@mui/material/OverridableComponent.BaseProps<M> */ "className" | "style" | "classes"
  ]) & Ref
}
