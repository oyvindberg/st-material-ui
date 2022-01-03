package com.olvind.mui.muiTypes

import com.olvind.mui.muiTypes.muiTypesBooleans.`true`
import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.global.JSX.LibraryManagedAttributes
import com.olvind.mui.std.Extract
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BaseProps[M /* <: OverridableTypeMap */] = /* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any
  
  type DistributiveOmit[T, K /* <: /* keyof any */ String */] = Omit[T, K]
  
  type GenerateStringUnion[T] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: true extends T[Key]? Key : never}[keyof T] */ js.Any, 
    String
  ]
  
  type OverridableStringUnion[T /* <: String | Double */, U] = GenerateStringUnion[Overwrite[Record[T, `true`], U]]
  
  @js.native
  trait OverridableTypeMap extends StObject {
    
    var defaultComponent: ReactElement = js.native
  }
  object OverridableTypeMap {
    
    @scala.inline
    def apply(defaultComponent: ReactElement): OverridableTypeMap = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverridableTypeMap]
    }
    
    @scala.inline
    implicit class OverridableTypeMapMutableBuilder[Self <: OverridableTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: ReactElement): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type OverrideProps[M /* <: OverridableTypeMap */, C /* <: ReactElement */] = BaseProps[M] with (DistributiveOmit[ComponentPropsWithRef[C], /* keyof @mui/types.@mui/types.BaseProps<M> */ String])
  
  type Overwrite[T, U] = (DistributiveOmit[T, /* keyof U */ String]) with U
  
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ Any, 
    JSXElementConstructor[
      (DistributiveOmit[
        LibraryManagedAttributes[Any, ComponentProps[Any]], 
        /* keyof InjectedProps */ String
      ]) with AdditionalProps
    ]
  ]
}
