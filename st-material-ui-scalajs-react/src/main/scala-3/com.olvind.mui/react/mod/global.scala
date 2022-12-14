package com.olvind.mui.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    type Element = japgolly.scalajs.react.facade.React.Element
    
    // We can't recurse forever because `type` can't be self-referential;
    // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately.
      * TS definition: {{{
      C extends react.react.MemoExoticComponent<infer T> | react.react.LazyExoticComponent<infer T> ? T extends react.react.MemoExoticComponent<infer U> | react.react.LazyExoticComponent<infer U> ? react.react.ReactManagedAttributes<U, P> : react.react.ReactManagedAttributes<T, P> : react.react.ReactManagedAttributes<C, P>
      }}}
      */
    @js.native
    trait LibraryManagedAttributes[C, P] extends StObject
  }
}
