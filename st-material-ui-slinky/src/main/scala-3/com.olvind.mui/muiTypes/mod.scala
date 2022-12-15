package com.olvind.mui.muiTypes

import com.olvind.mui.muiTypes.anon.Component
import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.react.mod.global.JSX.LibraryManagedAttributes
import com.olvind.mui.std.Extract
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BaseProps[M /* <: OverridableTypeMap */] = /* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any
  
  type DefaultComponentProps[M /* <: OverridableTypeMap */] = BaseProps[M] & (DistributiveOmit[
    ComponentPropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof @mui/types.@mui/types.BaseProps<M> */ String
  ])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Omit<T, K> : never
    }}}
    */
  type DistributiveOmit[T, K /* <: /* keyof any */ String */] = Omit[T, K]
  
  type GenerateStringUnion[T] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: true extends T[Key]? Key : never}[keyof T] */ js.Any, 
    String
  ]
  
  type IfEquals[T, U, Y, N] = Y
  
  @js.native
  trait OverridableComponent[M /* <: OverridableTypeMap */] extends StObject {
    
    def apply(props: DefaultComponentProps[M]): Element | Null = js.native
    // If you make any changes to this interface, please make sure to update the
    // `OverridableComponent` type in `mui-material/src/OverridableComponent.d.ts` as well.
    // Also, there are types in MUI Base that have a similar shape to this interface
    // (e.g. SelectUnstyledType, OptionUnstyledType, etc.).
    def apply[C /* <: ReactElement */](props: Component[C] & (OverrideProps[M, C])): Element | Null = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  type OverridableStringUnion[T /* <: String | Double */, U] = GenerateStringUnion[Overwrite[Record[T, true], U]]
  
  trait OverridableTypeMap extends StObject {
    
    var defaultComponent: ReactElement
  }
  object OverridableTypeMap {
    
    inline def apply(defaultComponent: ReactElement): OverridableTypeMap = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverridableTypeMap]
    }
    
    extension [Self <: OverridableTypeMap](x: Self) {
      
      inline def setDefaultComponent(value: ReactElement): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type OverrideProps[M /* <: OverridableTypeMap */, C /* <: ReactElement */] = BaseProps[M] & (DistributiveOmit[ComponentPropsWithRef[C], /* keyof @mui/types.@mui/types.BaseProps<M> */ String])
  
  type Overwrite[T, U] = (DistributiveOmit[T, /* keyof U */ String]) & U
  
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ Any, 
    JSXElementConstructor[
      (DistributiveOmit[
        LibraryManagedAttributes[Any, ComponentProps[Any]], 
        /* keyof InjectedProps */ String
      ]) & AdditionalProps
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function ? T : {[ K in keyof T ]: T[K]}
    }}}
    */
  type Simplify[T] = T
}
